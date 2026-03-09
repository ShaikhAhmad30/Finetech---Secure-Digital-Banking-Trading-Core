import React from "react";

function Portfolio(){

  const holdings=[

    {stock:"AAPL",shares:10},
    {stock:"TSLA",shares:5}

  ]

  return(

    <div style={{padding:"40px"}}>

      <h2>Portfolio</h2>

      <ul>

        {holdings.map((h,index)=>(
          <li key={index}>
            {h.stock} - {h.shares} shares
          </li>
        ))}

      </ul>

    </div>

  )

}

export default Portfolio;