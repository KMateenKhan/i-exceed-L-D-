'use strict';


const greet = function sayHi() { // scope of sayHi() is only within the function
    console.log("Hi there!");
};

greet();

let say=function(who)
{
  if(who)
  {
   console.log(`welcome ${who}`);
  }
  else{
   say("Guest");
  }
}
 
let welcome=say(); // doesn't return anything
//welcome("Zain"); // welcome is undefined
// if the parenthesis is removed then it executes

let sayHi=function display(who)
{
  if(who) {
   console.log(`welcome ${who}`);
  }
  else{
   display("Guest");
  }
}
sayHi("Sathishsivam");

let prints = sayHi;
prints("Bilal");