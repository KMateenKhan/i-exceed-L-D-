let bankaccount={};
 
Object.defineProperty(bankaccount,"balance",{
	get:function(){
    		return this.balance;
	},
	set:function(amt)
       {
        if(!this.balance)this.balance=0;
 
        this.balance+=amt;
        console.log(`Deposited ${amt} new balance ${this.balance}`); // getter is called
       }
}
);
 
bankaccount.balance=1000; // setter is called
bankaccount.balance=5000;
 
Object.defineProperty(bankaccount,"withdraw",{
    set:function(amt)
    {
        if(!this.balance)this.balance=0;
        if(amt>this.balance)
        {
            console.log("Insufficient balance");
        }
        else{
            this.balance-=amt;
            console.log(`withdraw ${amt} current balance ${this.balance}`);
        }
 }
});
 
//bankaccount.withdraw=2000;

console.log(bankaccount.balance); //  Maximum call stack size exceeded
