import React, {useState} from "react";

function Transfer(){

  const [recipient,setRecipient] = useState("");
  const [amount,setAmount] = useState("");

  const handleSubmit=(e)=>{

    e.preventDefault();

    alert("Transfer request sent");

  }

  return(

    <div style={{padding:"40px"}}>

      <h2>Transfer Money</h2>

      <form onSubmit={handleSubmit}>

        <input
        type="text"
        placeholder="Recipient Account"
        value={recipient}
        onChange={(e)=>setRecipient(e.target.value)}
        />

        <br/><br/>

        <input
        type="number"
        placeholder="Amount"
        value={amount}
        onChange={(e)=>setAmount(e.target.value)}
        />

        <br/><br/>

        <button>Send Money</button>

      </form>

    </div>

  )

}

export default Transfer;