package main

func repeatStrings(current string, count int) string {
	result := ""
	for i := 0; i < count; i++ {
		result = result + current
	}

	return result

}
