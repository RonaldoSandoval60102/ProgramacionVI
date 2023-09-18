class Shape {
    constructor(source) {
        this.source = source;
    }

    clone() {
        return new Shape(this.source);
    }
}

class Rectangle extends Shape {
    constructor(width, height) {
        super({ width, height });
    }
}

class Circle extends Shape {
    constructor(radius) {
        super({ radius });
    }
}

const shapes = [
    new Rectangle(100, 200),
    new Circle(50),
    new Circle(30),
    new Rectangle(60, 30),
];

const shapesCopy = shapes.map(shape => shape.clone());

console.dir({ shapes });

console.dir({ shapesCopy });

if (shapes[0] === shapesCopy[0]) {
    console.log('Shapes are the same');
} else {
    console.log('Shapes are not the same');
}