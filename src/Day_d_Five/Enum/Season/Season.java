package Enum.Season;

public enum Season {
    WINTER{
        @Override
        public String gettemp() {
            return "0°C-10°C";
        }
    },
    SPRING{
        @Override
        public String gettemp() {
            return "10°C-20°C";
        }
    },
    SUMMER{
        @Override
        public String gettemp() {
            return "20°C-30°C";
        }
    },
    FALL{
        @Override
        public String gettemp() {
            return "10°C-20°C";
        }
    };
    public abstract String gettemp();
}
