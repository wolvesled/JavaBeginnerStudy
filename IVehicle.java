// Module 8 Mastery Check No.9

public interface IVehicle {
	Vehicle(int p, int f, int m);

	// Return the range.
	int range();

	// Compute fuel needed for a given distance.
	double fuelneeded(int miles);
}
