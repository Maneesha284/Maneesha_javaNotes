//FOREACH
const numbers =[1,2,3,4,5,6]
numbers.forEach(num=>{
 //   console.log(num*2);
});

//FOR IN
for(let num1 in numbers){
    //console.log(num1);   //index number 
  //  console.log(numbers[num1]);  //array number
  //  console.log(numbers[num1]*3);
}

//FOR OF
for(let num2 in numbers){
    //console.log(num2);   //index number 
  //  console.log(numbers[num2]);  //array number
 //   console.log(numbers[num2]%2==0);  //true / false
}

const var1=numbers.map(var1=>var1*2);
//console.log(var1);

//const var2=numbers.filter(var2=>var2%2==0);
const var2=numbers.filter(var2=>var2%2===0);
console.log(var2);

const var3=numbers.reduce((total,num)=>total+num,0);
//console.log(var3);

