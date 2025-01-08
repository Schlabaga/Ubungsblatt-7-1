public class KelvinToCelciusStrategy implements ConversionStrategy{

    @Override
    public float convert(float value){
        return (float) (value -  273.15);
    }

    @Override
    public String getDescription(){
        return "Kelvin to Celcius";
    }

}
