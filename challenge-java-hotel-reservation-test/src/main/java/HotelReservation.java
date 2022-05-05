public class HotelReservation {
    public String getCheapestHotel (String input) {
    	
    	String clienteTipo = input.substring(0, input.indexOf(":"));
    	String dias = input.substring(input.indexOf(":") + 2);
    	
    	String[] diasSeparados = dias.split(",");
    	
    	float vLake = (float) 0.03;
    	float vBridge = (float) 0.02;
    	float vRigde = (float) 0.01;
    	
    	String cheapestHotel = null;
    	
    	if(clienteTipo.equals("Regular")) {
    		for (int i = 0; i < diasSeparados.length; i++) {
				if(diasSeparados[i].contains("sat") || diasSeparados[i].contains("sun")) {
					vLake += 90;
					vBridge += 60;
					vRigde += 150;
				}
				else {
					vLake += 110;
					vBridge += 160;
					vRigde += 220;
				}
			}
    	}
    	else {
    		for (int i = 0; i < diasSeparados.length; i++) {
				if(diasSeparados[i].contains("sat") || diasSeparados[i].contains("sun")) {
					vLake += 80;
					vBridge += 50;
					vRigde += 40;
				}
				else {
					vLake += 80;
					vBridge += 110;
					vRigde += 100;
				}
			}
    		
    	}
    	if(vRigde < vBridge) {
    		if(vRigde < vLake) {
    			cheapestHotel = "Ridgewood";
    		}
    		else {
    			cheapestHotel = "Lakewood";
    		}
    	}
    	else {
    		if(vBridge < vLake) {
    			cheapestHotel = "Bridgewood";
    		}
    		else {
    			cheapestHotel = "Lakewood";
    		}
    	}
        return cheapestHotel;
    }
}
