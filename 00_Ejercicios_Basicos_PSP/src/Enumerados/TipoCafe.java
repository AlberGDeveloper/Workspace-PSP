package Enumerados;

public enum TipoCafe {
		SOLO(1),CON_LECHE(1.5),EXPRESSO(2),LATTE(1),CARAJILLO(1.20),AMERICANO(1),CAPUCCINO(1.30),CON_HIELO(1.30), DESCAFEINADO(0.90), CORTADO(2);
		
		public double getPrecio() {
			return this.precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		private double precio;
		
		private TipoCafe (double precio) {
			this.precio=precio;
			
		}
		
}
