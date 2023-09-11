function PrototypeObject(name) {
    this.name = name;
}

const prototype = new PrototypeObject("prototype");

function cloneObject(obj) {
    function F() {}
    F.prototype = obj;
    return new F();
}

const clone = cloneObject(prototype);
console.log(clone.name);
const clone2 = cloneObject(prototype);
console.log(clone2.name);