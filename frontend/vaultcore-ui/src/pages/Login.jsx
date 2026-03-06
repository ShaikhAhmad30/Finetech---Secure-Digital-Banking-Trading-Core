import React, { useState } from "react";
import { loginUser, saveToken } from "../services/authService";
import "../styles/Login.css";

function Login() {

  const [email,setEmail] = useState("");
  const [password,setPassword] = useState("");
  const [error,setError] = useState("");

  const handleSubmit = async (e) => {

    e.preventDefault();

    try{

      const data = await loginUser(email,password);

      saveToken(data.token);

      window.location.href="/dashboard";

    }catch(err){

      setError("Invalid email or password");

    }

  };

  return(

    <div className="login-wrapper">

      <div className="login-card">

        <h1 className="logo">FinTech</h1>
        <p className="subtitle">Secure Digital Banking</p>

        {error && <p className="error">{error}</p>}

        <form onSubmit={handleSubmit}>

          <div className="input-group">
            <label>Email</label>
            <input
            type="email"
            placeholder="Enter your email"
            value={email}
            onChange={(e)=>setEmail(e.target.value)}
            required
            />
          </div>

          <div className="input-group">
            <label>Password</label>
            <input
            type="password"
            placeholder="Enter your password"
            value={password}
            onChange={(e)=>setPassword(e.target.value)}
            required
            />
          </div>

          <button className="login-btn" type="submit">
            Login
          </button>

        </form>

      </div>

    </div>

  );

}

export default Login;