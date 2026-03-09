import React, { useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import "../styles/Login.css";

function Register(){

  const navigate = useNavigate();

  const [form,setForm] = useState({
    fullName:"",
    dob:"",
    gender:"",
    email:"",
    phone:"",
    address:"",
    governmentId:"",
    panNumber:"",
    password:"",
    confirmPassword:""
  });

  const [message,setMessage] = useState("");

  const handleChange=(e)=>{

    setForm({
      ...form,
      [e.target.name]:e.target.value
    });

  };

  const handleSubmit=(e)=>{

    e.preventDefault();

    if(form.password !== form.confirmPassword){
      setMessage("Passwords do not match");
      return;
    }

    // Mock user exists condition
    if(form.email === "test@example.com"){
      setMessage("User already exists. Redirecting to login...");
      setTimeout(()=>navigate("/"),2000);
      return;
    }

    setMessage("Registration successful. Redirecting to login...");

    setTimeout(()=>{
      navigate("/");
    },2000);

  };

  return(

    <div className="login-wrapper">

      <div className="login-card">

        <h1 className="logo">FinTech</h1>
        <p className="subtitle">Secure Banking Registration</p>

        {message && <p>{message}</p>}

       <form onSubmit={handleSubmit} className="register-form">

  <div className="form-grid">

    <div className="input-group">
      <label>Full Name</label>
      <input type="text" name="fullName" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>Date of Birth</label>
      <input type="date" name="dob" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>Gender</label>
      <select name="gender" onChange={handleChange} required>
        <option value="">Select</option>
        <option>Male</option>
        <option>Female</option>
        <option>Other</option>
      </select>
    </div>

    <div className="input-group">
      <label>Email</label>
      <input type="email" name="email" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>Phone Number</label>
      <input type="text" name="phone" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>PAN Number</label>
      <input type="text" name="panNumber" onChange={handleChange} required/>
    </div>

    <div className="input-group full-width">
      <label>Address</label>
      <input type="text" name="address" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>Government ID</label>
      <input type="text" name="governmentId" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>Password</label>
      <input type="password" name="password" onChange={handleChange} required/>
    </div>

    <div className="input-group">
      <label>Confirm Password</label>
      <input type="password" name="confirmPassword" onChange={handleChange} required/>
    </div>

  </div>

  <button className="login-btn">Register</button>

</form>
        <p style={{marginTop:"15px"}}>
          Already have an account? <Link to="/">Login</Link>
        </p>

      </div>

    </div>

  );

}

export default Register;