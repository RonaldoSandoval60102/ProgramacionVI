class Mobile {

    constructor() {
        this.volume = 0;
    }

    up() {
        this.volume++;
        return `Volume is set to ${this.volume}`;
    }

    down() {
        this.volume--;
        return `Volume is set to ${this.volume}`;
    }

}

class Device {
    up() {
        return "Increasing volume";
    }

    down() {
        return "Decreasing volume";
    }

}

class MobileAdapter extends Device {
    constructor(device) {
        super();
        this.device = device;
    }

    up() {
        return this.device.up();
    }

    down() {
        return this.device.down();
    }
}

const mobile = new Mobile();
const mobileAdapter = new MobileAdapter(mobile);

console.log(mobileAdapter.up());
console.log(mobileAdapter.down());