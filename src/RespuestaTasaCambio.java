import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class RespuestaTasaCambio {

    @SerializedName("base_code")
    private String moneda_base;

    @SerializedName("conversion_rates")
    private Map<String, Double> tasas_conversion;

    public String obtenerMonedaBase() {
        return moneda_base;
    }

    public Map<String, Double> obtenerTasasConversion() {
        return tasas_conversion;
    }
}