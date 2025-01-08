public class CelciusToKelvinStrategy implements ConversionStrategy{

    @Override
    public float convert(float value){
        return (float) (value+ 273.15);
    }

    @Override
    public String getDescription(){
        return "Celcius to Kelvin";
    }

}
