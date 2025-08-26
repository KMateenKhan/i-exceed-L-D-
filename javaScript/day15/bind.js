let trainee=
	{name:"rakesh",
	 year:1979,
	 //display : function()
	 //	{
	 //		console.log(`Function of trainee.`);
	 //	},
         
         calculateMyAge:function()
         {
           //this.dob=dob;
           console.log(this.year - 10);
 
        }

	};
 
let trainer={
    name:"sivam",
    year:2002,
    display:function()
    {
        //return this.name;
	//return this.year;
	console.log(this.name);
	console.log(this.year);
    },
    calculateMyAge:function()
    {
        //this.dob=dob;
        console.log(this.year);
 
    }
 
};
trainer.display();
trainer.display.bind(trainee)();
console.log('\n');

trainer.calculateMyAge();

trainer.calculateMyAge.bind(trainee)();
trainee.calculateMyAge.bind(trainer)();
