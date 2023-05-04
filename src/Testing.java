class Testing {
//Our variables for our code
    private double amount = 0;
    private double perc = 0;
    private double cycle = 0;

    private double Annuel = 100;

    private double  Anuelperc = 12;


    //our get method in order to use our code in our program
    public double setAmount(double newAmoubt) {
        amount = newAmoubt;
        return newAmoubt;
    }

    public void setAnnuel(double newAnnuel) {
        Annuel = newAnnuel;
    }

    public void setAnuelperc(double newAnuelperc) {
        Anuelperc = newAnuelperc;
    }

    public double setPerc(double newPerc) {
        perc = newPerc;
        return newPerc;
    }

    public double setCycle(double newCycle) {
        cycle = newCycle;
        return newCycle;
    }

    //our code that allows us to use these variables in other java classes

    public double getAmount() {
        return amount;
    }

    public double getAnnuel() {
        return Annuel;
    }

    public double getAnuelperc() {
        return Anuelperc;
    }

    public double getPerc() {
        return perc;
    }

    public double getCycle() {
        return cycle;
    }

// Code for our calculations
    private double valuediv,
                   results,
                   firstvalue,
                   secondvalue;
    String final_results;

    public double setValuediv(double newValuediv){
        valuediv = newValuediv;
        return newValuediv;
    }

    public double setResults(double newResults){
        results = newResults;
        return newResults;
    }
    public double setFirstvalue(double newFirstvalue){

        firstvalue = newFirstvalue;
        return newFirstvalue;
    }

    public double setSecondvalue(double newSecondvalue) {
        secondvalue = newSecondvalue;
        return newSecondvalue;
    }

    public String setFinal_results(double newFinal_results) {
        final_results.equals(newFinal_results);
        return String.valueOf(newFinal_results);
    }

    public double getFirstvalue() {
        return firstvalue;
    }

    public double getResults() {
        return results;
    }

    public double getSecondvalue() {
        return secondvalue;
    }

    public double getValuediv() {
        return valuediv;
    }

    public String getFinal_results() {
        return final_results;
    }
}
