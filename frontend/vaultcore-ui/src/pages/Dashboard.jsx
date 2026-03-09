import React from "react";
import { Link } from "react-router-dom";

function Dashboard(){

  return(

    <div style={{padding:"40px"}}>

      <h1>VaultCore Dashboard</h1>

      <h3>Account Balance</h3>
      <p>$24,500</p>

      <h3>Operations</h3>

      <ul>

        <li><Link to="/balance">Check Balance</Link></li>
        <li><Link to="/transfer">Transfer Money</Link></li>
        <li><Link to="/trading">Trade Stocks</Link></li>
        <li><Link to="/portfolio">View Portfolio</Link></li>
        <li><Link to="/ledger">Transaction History</Link></li>
        <li><Link to="/statement">Download Statement</Link></li>
        <li><Link to="/logout">Logout</Link></li>

      </ul>

    </div>

  )

}

export default Dashboard;