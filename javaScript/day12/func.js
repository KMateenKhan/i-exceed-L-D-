'use strict';

function myFunc(theObject) {
  theObject.make = "Toyota";
}
const myCar = {
  make: "Honda",
  model: "Accord",
  year: 1998,
};

console.log(myCar.make);
myFunc(myCar);
console.log(myCar.make);

console.log(square(5));
// function decalration is hoisted
function square(n){ 
	return n*n;
};

// function expression is not hoisted
//console.log(sqr(6));
const sqr = function (n){
	return n*n;
};

