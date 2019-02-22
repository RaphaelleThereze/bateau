package repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestBateauRepo {

	@Test
	void test() {
		List<String> res = bateauRepo.findAll();
		System.out.println(res);
	}

}
