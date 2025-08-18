'use strict';



console.log(Number.MAX_SAFE_INTEGER); // max value of integer
console.log(Number.MIN_SAFE_INTEGER);
let maxBigInt=BigInt(9007199254740992);
console.log(maxBigInt+12n);
console.log(typeof(maxBigInt));

let x;
console.log(typeof(x));

let y=null;
console.log(typeof(y));
y=1;
if(y){
	console.log("If block:"+y);
}
else{
	console.log("Else block:"+y);
}