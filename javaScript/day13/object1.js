'use strict';

// prototypal inheritance

let f1 =
{
	name :"F1_details",
	
	display:function(team){
			return team;
		}
};

let mercedes = Object.create(f1);
mercedes.driver = "George Russell";
mercedes.chamionships  = 9 ;

let redbull = Object.create(f1);
redbull.driver="Max Verstapen";
redbull.championships = 8;

console.log(mercedes.name);
console.log(mercedes.display("Mercedes Petronas Motorsport"));
console.log(mercedes.driver);

console.log(redbull.name);
console.log(redbull.display("\nRedBull Racing"));

console.log("\n");
console.log(mercedes); // this displays only the keys created now 
console.log(redbull);

console.log('\n');
console.log(f1);
