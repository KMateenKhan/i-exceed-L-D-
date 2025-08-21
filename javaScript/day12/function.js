'use strict';

let num=4;


function salute(){};
if(num==1)
{
	salute()
	{
		console.log("(function prototype)Num value is 1.")
	};
}
else{
	salute()
	{
		console.log("(function prototype)Num value ??.")
	};
}

if(num==1)
{
	var sal = function() // if let is used then it's block scope
	{
		console.log("(use of var)Num value is 1.")
	};
}
else{
	var sal = function()
	{
		console.log("(use of var)Num value ??.")
	};
}
salute();
sal();

// arguments[] in array function
//let argu=(...args)=>console.log(arguments.length); // this gives inefficiet output

let argu=(...args)=>console.log(args.length);
argu(1,2,3,4,5,6,7,8,9,10);


