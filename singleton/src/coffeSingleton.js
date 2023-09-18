class CoffeeSingleton {
    constructor() {
        if (CoffeeSingleton.instance instanceof CoffeeSingleton) {
            return CoffeeSingleton.instance;
        }
        this.coffee = 'Americano';
        CoffeeSingleton.instance = this;
    }
    getCoffee() {
        return this.coffee;
    }
}

const coffeeSingleton = new CoffeeSingleton();
const coffeeSingleton2 = new CoffeeSingleton();

if (coffeeSingleton === coffeeSingleton2) {
    console.log('Same instance');
}