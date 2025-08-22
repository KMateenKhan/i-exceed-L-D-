'use strict';

const bankaccount={
    balance:1000,
    deposit:function(amt)
            {
                this.balance+=amt;
            },
    withdraw:function(amt)
    {
        this.balance-=amt;
    },
    getBalance:function(amt)
    {
        return this.balance;
    }
 
}


let businessbankaccount=   Object.create(bankaccount,{accno:{value:"xxx123xxx",configurable:false,writable:true,enumerable:true},
             		 holder:{value:"Adam",writable:true,configurable:false,enumerable:true},
              		 balance:{value:446699.00,writable:true,enumerable:true}});
//businessbankaccount.holder="abcd";
console.log(businessbankaccount.accno);
console.log(businessbankaccount.holder);
console.log(businessbankaccount.balance);
businessbankaccount.deposit(200000);
console.log(businessbankaccount.balance);
businessbankaccount.withdraw(50001);
console.log(businessbankaccount.balance);

for(let key in businessbankaccount){
	console.log(key);
}

delete businessbankaccount.accno;