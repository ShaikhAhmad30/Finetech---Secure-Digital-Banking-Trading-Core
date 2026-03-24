import React from "react";

function Success(){

  const accountNumber = localStorage.getItem("accountNumber");
  const userName = localStorage.getItem("userName");

  return(

    <div className="login-wrapper">

      <div className="login-card">

        <h2>🎉 Account Created Successfully</h2>

        <p><strong>Name:</strong> {userName}</p>

        <p><strong>Account Number:</strong> {accountNumber}</p>

        <p>You can login using:</p>

        <ul>
          <li>Email</li>
          <li>Account Number</li>
        </ul>

        <a href="/" className="login-btn">
          Go to Login
        </a>

      </div>

    </div>

  );

}

export default Success;