package main

import (
	"bytes"
	"math/rand"
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestForStringLengthNil(t *testing.T) {

	actual := ""
	expected := repeatStrings("Go", 0)
	assert.Equal(t, expected, actual)

}

func TestForRandomStringLength(t *testing.T) {

	random := rand.Intn(99999)
	var buffer bytes.Buffer

	for i := 0; i < random; i++ {
		buffer.WriteString("Go")
	}

	expected := buffer.String()

	actual := repeatStrings("Go", random)
	assert.Equal(t, expected, actual)
}

func TestForNegativeStringLength(t *testing.T) {
	random := -rand.Intn(99999)
	actual := ""
	expected := repeatStrings("Go", random)
	assert.Equal(t, expected, actual)

}
