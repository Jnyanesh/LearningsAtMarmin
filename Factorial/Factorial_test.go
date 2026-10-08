package day4

import (
	"math/rand"
	"testing"

	"github.com/stretchr/testify/assert"
)

func Test0factorialIs1(t *testing.T) {
	expected := 1
	actual := factorial(0)
	assert.Equal(t, actual, expected)
}

func TestRandomIntegerFactorial(t *testing.T) {
	random := rand.Intn(100000)
	actual := factorial(random)
	var expected int

	for random >= 1 {
		expected = random * (random - 1)
		random--
	}

	assert.Equal(t, actual, expected)

}
