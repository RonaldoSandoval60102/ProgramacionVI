class coffee {
    constructor() {
        this.name = "Coffee";
        this.price = 5;
    }
}

class MilfDecotor {
    constructor(coffee) {
        this.coffee = coffee;
    }

    getPrice() {
        return this.coffee.getPrice() + 1;
    }

    getName() {
        return this.coffee.getName() + " with milk";
    }
}

class AmericanDecotor {
    constructor(coffee) {
        this.coffee = coffee;
    }

    getPrice() {
        return this.coffee.getPrice() + 2;
    }

    getName() {
        return this.coffee.getName() + " with american";
    }
}

const coffee = new coffee();
console.log(coffee.getName(), coffee.getPrice());