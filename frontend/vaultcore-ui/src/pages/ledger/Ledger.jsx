import React from "react";

function Ledger(){

  const tx=[

    {id:1,type:"Debit",amount:200,date:"May 1"},
    {id:2,type:"Credit",amount:500,date:"May 3"}

  ]

  return(

    <div style={{padding:"40px"}}>

      <h2>Ledger History</h2>

      <table border="1" cellPadding="10">

        <thead>

          <tr>

            <th>ID</th>
            <th>Type</th>
            <th>Amount</th>
            <th>Date</th>

          </tr>

        </thead>

        <tbody>

          {tx.map((t)=>(

            <tr key={t.id}>

              <td>{t.id}</td>
              <td>{t.type}</td>
              <td>{t.amount}</td>
              <td>{t.date}</td>

            </tr>

          ))}

        </tbody>

      </table>

    </div>

  )

}

export default Ledger;