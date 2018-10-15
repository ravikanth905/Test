public class produt {
		private int Id;
		private String description;
		private String name;
		private int price;
		private int quantity;
		private int Supplierid;
		
		public product(int id, String description, String name, int price, int quantity, int supplierid) {
			super();
			Id = id;
			this.description = description;
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			Supplierid = supplierid;
		}

	public product() {
			super();
		}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + Supplierid;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sql other = (Sql) obj;
		if (Id != other.Id)
			return false;
		if (Supplierid != other.Supplierid)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getSupplierid() {
			return Supplierid;
		}

		public void setSupplierid(int supplierid) {
			Supplierid = supplierid;
		}

		@Override
		public String toString() {
			return "Sql [Id=" + Id + ", description=" + description + ", name=" + name + ", price=" + price
					+ ", quantity=" + quantity + ", Supplierid=" + Supplierid + "]";
		}
		
}