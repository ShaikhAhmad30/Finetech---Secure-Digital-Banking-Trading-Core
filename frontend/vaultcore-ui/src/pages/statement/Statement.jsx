import React from "react";

function Statement(){

  const download=()=>{

    alert("Generating monthly statement PDF");

  }

  return(

    <div style={{padding:"40px"}}>

      <h2>Download Statement</h2>

      <button onClick={download}>
        Download Monthly Statement
      </button>

    </div>

  )

}

export default Statement;