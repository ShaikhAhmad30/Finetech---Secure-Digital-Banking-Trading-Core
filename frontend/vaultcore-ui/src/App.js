import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Register from "./pages/Register";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";

import Balance from "./pages/banking/Balance";
import Transfer from "./pages/banking/Transfer";

import Trading from "./pages/trading/Trading";
import Portfolio from "./pages/portfolio/Portfolio";

import Ledger from "./pages/ledger/Ledger";
import Statement from "./pages/statement/Statement";

import Logout from "./pages/Logout";

function App(){

  return(

    <BrowserRouter>

      <Routes>

  <Route path="/" element={<Login/>} />
  <Route path="/register" element={<Register/>} />
  <Route path="/dashboard" element={<Dashboard/>} />


        <Route path="/balance" element={<Balance/>} />

        <Route path="/transfer" element={<Transfer/>} />

        <Route path="/trading" element={<Trading/>} />

        <Route path="/portfolio" element={<Portfolio/>} />

        <Route path="/ledger" element={<Ledger/>} />

        <Route path="/statement" element={<Statement/>} />

        <Route path="/logout" element={<Logout/>} />

      </Routes>

    </BrowserRouter>

  )

}

export default App;