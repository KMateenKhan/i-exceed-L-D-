'use strict';

let f1 = {
  teams:["Aston Martin","Cadillac","Ferrari"],
  drivers:["Fernando Alonso","Sergio Perez","Lewis Hamilton"],
  display:function(){console.log("F1!")}
};

let jsonData = JSON.stringify(f1);
console.log(jsonData); // functions are not displayed

let objectData = JSON.parse(jsonData);
console.log(objectData);

console.log(f1);