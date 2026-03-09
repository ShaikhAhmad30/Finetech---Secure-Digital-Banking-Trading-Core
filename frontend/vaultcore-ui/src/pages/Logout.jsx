import React from "react";

function Logout(){

  localStorage.removeItem("token");

  window.location.href="/";

  return null;

}

export default Logout;