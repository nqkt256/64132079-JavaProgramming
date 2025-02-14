
public class SanPham {
		int maSP;
		String tenSP;
		String loaiSP;
		String anhSP;
		// Hàm tạo không tham số
		public SanPham() {
			super();
		}
		// Hàm khởi tạo có tham số
		public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
			super();
			this.maSP = maSP;
			this.tenSP = tenSP;
			this.loaiSP = loaiSP;
			this.anhSP = anhSP;
		}
		// Các getter và setter
		public int getMaSP() {
			return maSP;
		}
		public void setMaSP(int maSP) {
			this.maSP = maSP;
		}
		public String getTenSP() {
			return tenSP;
		}
		public void setTenSP(String tenSP) {
			this.tenSP = tenSP;
		}
		public String getLoaiSP() {
			return loaiSP;
		}
		public void setLoaiSP(String loaiSP) {
			this.loaiSP = loaiSP;
		}
		public String getAnhSP() {
			return anhSP;
		}
		public void setAnhSP(String anhSP) {
			this.anhSP = anhSP;
		}
		//Phương thức toString()
		@Override
		public String toString() {
			return "[Sản Phẩm " + maSP + ", Tên SP = " + tenSP + ", Loại SP = " + loaiSP +  "]";
		}
	
}
