let bankaccount={};
 
// "this._balance" is naming convention to indicate that the property is intended to be used internally.


Object.defineProperty(bankaccount,"balance",{
	//get:function(){
    	//	return this._balance;
	//},
	set:function(amt)
       {
        if(!this._balance)this._balance=0;
 
        this._balance+=amt;
        console.log(`Deposited ${amt} new balance ${this._balance}`); // getter is called
       }
}
);
 
bankaccount.balance=1000; // setter is called
bankaccount.balance=5000;
 
Object.defineProperty(bankaccount,"withdraw",{
    set:function(amt)
    {
        if(!this._balance)this._balance=0;
        if(amt>this._balance)
        {
            console.log("Insufficient balance");
        }
        else{
            this._balance-=amt;
            console.log(`withdraw ${amt} current balance ${this._balance}`);
        }
 }
});
 
//bankaccount.withdraw=2000;

console.log(bankaccount._balance); // getter not required if '_'is used