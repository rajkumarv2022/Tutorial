const obj = {name:"xxx",Age:25,Gender:'y','class-school':'XII',bool:{tree:"Mango",fruit:"Apple"},func: function fun(){console.log("I am inside");}}; //here name is property and "XXX" is a value
console.log(obj);
console.log(obj.name);
obj.name='YYY';
console.log(obj);
delete obj.name;
console.log(obj);
obj.name='ZZZ';
console.log(obj);
console.log(obj['name']);
// console.log(obj.class-school); // it will make a error because it value has - symbol 
console.log(obj['class-school']);
console.log(obj.bool.tree);
console.log(obj['bool']['tree']);
console.log(obj.func());