'use strict';

// Math is not a constructor. 
//You cannot use it with the new operator or invoke the Math object as a function. 
//All properties and methods of Math are static.

//Properties
console.log("Euler's number : "+Math.E); 
console.log("LOG of 10 : "+Math.LN10);
console.log("LOG of 2 : "+Math.LN2); 
console.log("Base 10 LOG E : "+Math.LOG10E); 
console.log("Base 2 LOG E : "+Math.LOG2E);
console.log("PI : "+Math.PI); 
console.log("Sqrt(0.5) : "+Math.SQRT1_2);
console.log("Sqrt(2) : "+Math.SQRT2)
//console.log(Math.SQRT5);

//Methods

console.log("Absolute : "+ Math.abs(-343.3425342)); // returns it's opposite if negative else number itself
console.log("Inverse the cosine : "+ Math.acos(0));
console.log("Inverse hyberbolic of the cosine : "+ Math.acosh(0));
console.log("Inverse the sine : "+ Math.asin(0));
console.log("Inverse hyperbolic of the sine : "+ Math.asinh(0));
console.log("Inverse the tan : "+ Math.atan(5/3));
console.log("Angl in the plane : "+ (Math.atan2(10,10)*180)/Math.PI);
console.log("Inverse hyberbolic tan : "+ Math.atanh(0.98));
console.log("Cube root : "+ Math.cbrt(27));
console.log("Ceil : "+ Math.ceil(7.0098));//rounds up and returns the smallest integer greater than or equal to a given number.
console.log("Floor : "+ Math.floor(7.0098));//rounds up and returns the largest integer less than or equal to a given number.
console.log("Leading zeros : "+ Math.clz32(4));
console.log("Sine : "+ Math.sin(10));
console.log("Hyberbolic sine : "+ Math.sinh(10));
console.log("Cosine : "+ Math.cos(10));
console.log("Hyberbolic cosine : "+ Math.cosh(10));
console.log("E raised to the power : "+ Math.exp(2.718));
console.log("E(x) -1 : " + Math.expm1(2.718));
//console.log("Nearest 16bit half precission : "+ Math.f16round(5.05));
console.log("Nearest 32bit precission : "+ Math.fround(5.05));
console.log("Sqrt of squr of no.s : " +Math.hypot(3, 4));
console.log("Multiplication : "+ Math.imul(67,34));
console.log("Log : "+ Math.log(64));
console.log("Log10 : "+ Math.log10(64));
console.log("Log2 : "+ Math.log2(64));
console.log("ln(1+x) : "+ Math.log1p(1));
console.log("Max value : "+ Math.max(1, 3, 2,11,12,34,22,66,18,99));
console.log("Min value : "+ Math.min(1, 3, 2,11,12,34,22,66,18,99));
console.log("Power : "+ Math.pow(9,3));
console.log("Random[0,1] : "+ Math.random());
console.log("Round : "+ Math.round(6.5));
console.log("Sign : "+ Math.sign(-23));
console.log("Sqrt : "+ Math.sqrt(98));
//console.log("Sum : "+ Math.sumPrecise([1, 3, 2,11,12,34,22,66,18,99]));
console.log("Truncate : "+ Math.trunc(19.999)); // returns the integer part



// Degree and Radian coversion

function degToRad(degrees) {
  return degrees * (Math.PI / 180);
}

function radToDeg(rad) {
  return rad / (Math.PI / 180);
}

