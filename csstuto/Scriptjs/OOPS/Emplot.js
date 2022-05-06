class Emplot
{
    setEmployeInfo(name,id,age)
    {
        this.name = name;
        this.id = id;
        this.age = age;

    }
}
let emp = new Emplot();
emp.setEmployeInfo("tanver",2,18);
console.log(emp.name);
console.log(emp.id);
console.log(emp.age);