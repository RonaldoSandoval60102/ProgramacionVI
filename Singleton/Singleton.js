class Singleton {
    constructor() {
        if (!Singleton.instance) {
            Singleton.instance = this;
        }
        return Singleton.instance;
    }

    getSingletonName() {
        return this.singletonName;
    }
}

const singleton1 = new Singleton();
singleton1.singletonName = 'singleton1';
console.log(singleton1.getSingletonName());