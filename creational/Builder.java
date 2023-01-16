class Phone {
    private final String os;
    private final String processor;
    private final int ram;
    private final int battery;
    
    public static class Builder {
        private String os;
        private String processor;
        private int ram;
        private int battery;
        
        public Builder() {
            this.os = "Android";
            this.processor = "Qualcomm";
            this.ram = 6;
            this.battery = 6000;
        }
        
        public Phone build() {
            return new Phone(os, processor, ram, battery);
        }
        
        public Builder setOs(String os) {
            this.os = os;
            return this;
        }
        
        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }
        
        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }
        
    }
    
    public Phone(String os, String processor, int ram, int battery) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
    }
    
    @Override
    public String toString() {
        return String.format("Phone {os=%s, processor=%s, ram=%d, battery=%d}", os, processor, ram, battery);
    }
}

class Main {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder().build();
        System.out.println(phone);
    }
}
