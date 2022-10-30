public class Vector {

        // Три приватных поля
        private double x;
        private double y;
        private double z;


        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double length() {
            return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        }


        public double scalar() {
            return this.x * this.x + this.y * this.y + this.z * this.z;
        }


        public Vector vctr() {
            return new Vector(
                    this.y * this.z - this.z * this.y,
                    this.z * this.x - this.x * this.z,
                    this.x * this.y - this.y * this.x);
        }


        public double cos(Vector vector) {
            return this.scalar() / (this.length() * vector.length());
        }

        public Vector plus(Vector vector) {
            return new Vector(
                    this.x + vector.x,
                    this.y + vector.y,
                    this.z + vector.z
            );
        }

        public Vector minus(Vector vector) {
            return new Vector(
                    this.x - vector.x,
                    this.y - vector.y,
                    this.z - vector.z
            );
        }

        public static Vector[] sluch(int n){
            Vector[] vectors = new Vector[n];
            for(int i =0; i < n; i++){
                vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
            }
            return vectors;
        }

}
