class Pair<X, T> {
	private X first;
	private T second;
	private Pair(X f, T s) {
		first = f;
		second = s;
	}
	public static <A, B> Pair<A, B> of(A f, B s) {
		return new Pair<A, B>(f, s);
	}
	public X getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	private boolean firstEq(Pair a) {
		if (this.getFirst() == null && a.getFirst() == null) {
			return true;
		}
		if (this.getFirst() == null || a.getFirst() == null) {
			return false;
		}
		if (this.getFirst().equals(a.getFirst())) {
			return true;
		}
		return false;
	}
	private boolean secondEq(Pair a) {
		if (this.getSecond() == null && a.getSecond() == null) {
			return true;
		}
		if (this.getSecond() == null || a.getSecond() == null) {
			return false;
		}
		if (this.getSecond().equals(a.getSecond())) {
			return true;
		}
		return false;
	}
	public boolean equals(Pair a) {
		return this.firstEq(a) && this.secondEq(a);
	}
	public int hashCode() {
		return Objects.hash(first, second);
	}
}
