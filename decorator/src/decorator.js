// component
class Coffee {
    getCost() {
        return 1;
    }

    getDescription() {
        return 'Coffee';
    }
}
// decorator

class CoffeeDecorator extends Coffee {
    constructor(Coffee) {
        super();
        this.Coffee = Coffee;
    }

    getCost() {
        return this.Coffee.getCost();
    }

    getDescription() {
        return this.Coffee.getDescription();
    }
}

// concrete decorator

class SimpleCoffee extends Coffee {

    getCost() {
        return 1.5;
    }

    getDescription() {
        return 'Simple Coffee';
    }
}

// concrete decorator

class CoffeeMilk extends CoffeeDecorator {
    constructor(Coffee) {
        super(Coffee);
    }

    getCost() {
        return super.getCost() + 0.5;
    }

    getDescription() {
        return super.getDescription() + ', milk';
    }
}

// Client

const coffe = new SimpleCoffee
const coffeWithMilk = new CoffeeMilk(coffe);


console.log(`Cost: ${coffe.getCost()}, Description: ${coffe.getDescription()}`);
console.log(`Cost: ${coffeWithMilk.getCost()}, Description: ${coffeWithMilk.getDescription()}`);