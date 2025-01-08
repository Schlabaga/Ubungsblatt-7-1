public class MileToKilometerStrategy implements ConversionStrategy{

    @Override
    public float convert(float value){
        return (float) (value*1.609);
    }

    @Override
    public String getDescription(){
        return "Mile to kilometer";
    }

}
