package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private Scale scale;

    enum Scale {
        INCHES,
        ML
      }

    /**
     * Sets the length scale for rainfall.
     *
     * @param inches if true, sets the scale to inches; if false, sets the scale to millimeters.
     */
    public void setLengthScale(Scale scale) {
        //less clearity with parameter being bool inches
        this.scale = scale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     * 
     * @return the rainfall amount. If the measurement is in inches, it returns the value as is.
     *         If the measurement is not in inches, it converts the value to millimeters.
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (scale == Scale.INCHES) {
            return wsRainfall;
        } else {
            return wsRainfall / 2.54;
        }
    }
}
