import React from "react";

function Trading(){

  const stocks=[

    {symbol:"AAPL",price:180},
    {symbol:"GOOGL",price:135},
    {symbol:"TSLA",price:210}

  ];

  return(

    <div style={{padding:"40px"}}>

      <h2>Stock Trading</h2>

      <table border="1" cellPadding="10">

        <thead>

          <tr>

            <th>Stock</th>
            <th>Price</th>
            <th>Action</th>

          </tr>

        </thead>

        <tbody>

          {stocks.map((s)=>(

            <tr key={s.symbol}>

              <td>{s.symbol}</td>
              <td>${s.price}</td>

              <td>

                <button>Buy</button>
                <button>Sell</button>

              </td>

            </tr>

          ))}

        </tbody>

      </table>

    </div>

  )

}

export default Trading;