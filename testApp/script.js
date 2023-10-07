// function to add two number
function add(a, b) {
  return a + b;
}

countNumberOfDaysbetweenDates = function (startDate, endDate) {
  var oneDay = 24 * 60 * 60 * 1000; // hours*minutes*seconds*milliseconds
  return Math.round(
    Math.abs((startDate.getTime() - endDate.getTime()) / oneDay)
  );
};

// creat a new method to subtract two numbers
function subtract(a, b) {
  return a - b;
}
