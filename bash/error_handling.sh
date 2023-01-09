main() {
  local arguments=$#
  if [[ $arguments -eq 1 ]]; then
    echo "Hello, $1"
  else
    echo "Usage: error_handling.sh <person>"
    return 1
  fi
}

main "$@"
