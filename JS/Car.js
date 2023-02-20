class Car {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  PrintCar() {
    console.log(this.make);
    console.log(this.model);
    console.log(this.year);
  }
}
