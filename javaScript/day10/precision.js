'use strict';

let x=0.1;
let y=0.2;
let sum=x+y;
console.log(sum);

if(sum === 0.3)
{
	console.log('true');
}
else{
	console.log('false');
}

function areEqual(a, b) {
  return Math.abs(a - b) < Number.EPSILON;
}

console.log(areEqual(0.1 + 0.2, 0.3)); // true
